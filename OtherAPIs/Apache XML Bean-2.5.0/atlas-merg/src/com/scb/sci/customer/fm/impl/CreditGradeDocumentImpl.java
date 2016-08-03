/*
 * An XML document type.
 * Localname: creditGrade
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.CreditGradeDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one creditGrade(@) element.
 *
 * This is a complex type.
 */
public class CreditGradeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.CreditGradeDocument
{
    private static final long serialVersionUID = 1L;
    
    public CreditGradeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREDITGRADE$0 = 
        new javax.xml.namespace.QName("", "creditGrade");
    
    
    /**
     * Gets the "creditGrade" element
     */
    public com.scb.sci.customer.fm.CreditGradeDocument.CreditGrade getCreditGrade()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.scb.sci.customer.fm.CreditGradeDocument.CreditGrade target = null;
            target = (com.scb.sci.customer.fm.CreditGradeDocument.CreditGrade)get_store().find_element_user(CREDITGRADE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "creditGrade" element
     */
    public void setCreditGrade(com.scb.sci.customer.fm.CreditGradeDocument.CreditGrade creditGrade)
    {
        generatedSetterHelperImpl(creditGrade, CREDITGRADE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "creditGrade" element
     */
    public com.scb.sci.customer.fm.CreditGradeDocument.CreditGrade addNewCreditGrade()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.scb.sci.customer.fm.CreditGradeDocument.CreditGrade target = null;
            target = (com.scb.sci.customer.fm.CreditGradeDocument.CreditGrade)get_store().add_element_user(CREDITGRADE$0);
            return target;
        }
    }
    /**
     * An XML creditGrade(@).
     *
     * This is a complex type.
     */
    public static class CreditGradeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.CreditGradeDocument.CreditGrade
    {
        private static final long serialVersionUID = 1L;
        
        public CreditGradeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LEID$0 = 
            new javax.xml.namespace.QName("", "leId");
        private static final javax.xml.namespace.QName CREDITGRADEID$2 = 
            new javax.xml.namespace.QName("", "creditGradeId");
        private static final javax.xml.namespace.QName CREDITGRADETYPE$4 = 
            new javax.xml.namespace.QName("", "creditGradeType");
        private static final javax.xml.namespace.QName CREDITGRADECODE$6 = 
            new javax.xml.namespace.QName("", "creditGradeCode");
        private static final javax.xml.namespace.QName CREDITGRADEEFFECTIVEDATE$8 = 
            new javax.xml.namespace.QName("", "creditGradeEffectiveDate");
        private static final javax.xml.namespace.QName CREDITGRADEREASONFORCHANGE$10 = 
            new javax.xml.namespace.QName("", "creditGradeReasonForChange");
        private static final javax.xml.namespace.QName APPROVERLOCATION$12 = 
            new javax.xml.namespace.QName("", "approverLocation");
        private static final javax.xml.namespace.QName COINNO$14 = 
            new javax.xml.namespace.QName("", "coinNo");
        private static final javax.xml.namespace.QName APPROVEREMPID$16 = 
            new javax.xml.namespace.QName("", "approverEmpId");
        private static final javax.xml.namespace.QName APPROVERNAME$18 = 
            new javax.xml.namespace.QName("", "approverName");
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
         * Gets the "creditGradeId" element
         */
        public java.lang.String getCreditGradeId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREDITGRADEID$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "creditGradeId" element
         */
        public org.apache.xmlbeans.XmlString xgetCreditGradeId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CREDITGRADEID$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "creditGradeId" element
         */
        public void setCreditGradeId(java.lang.String creditGradeId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREDITGRADEID$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CREDITGRADEID$2);
                }
                target.setStringValue(creditGradeId);
            }
        }
        
        /**
         * Sets (as xml) the "creditGradeId" element
         */
        public void xsetCreditGradeId(org.apache.xmlbeans.XmlString creditGradeId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CREDITGRADEID$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CREDITGRADEID$2);
                }
                target.set(creditGradeId);
            }
        }
        
        /**
         * Gets the "creditGradeType" element
         */
        public com.scb.sci.customer.fm.CreditGradeTypeDocument.CreditGradeType getCreditGradeType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.CreditGradeTypeDocument.CreditGradeType target = null;
                target = (com.scb.sci.customer.fm.CreditGradeTypeDocument.CreditGradeType)get_store().find_element_user(CREDITGRADETYPE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "creditGradeType" element
         */
        public void setCreditGradeType(com.scb.sci.customer.fm.CreditGradeTypeDocument.CreditGradeType creditGradeType)
        {
            generatedSetterHelperImpl(creditGradeType, CREDITGRADETYPE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "creditGradeType" element
         */
        public com.scb.sci.customer.fm.CreditGradeTypeDocument.CreditGradeType addNewCreditGradeType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.CreditGradeTypeDocument.CreditGradeType target = null;
                target = (com.scb.sci.customer.fm.CreditGradeTypeDocument.CreditGradeType)get_store().add_element_user(CREDITGRADETYPE$4);
                return target;
            }
        }
        
        /**
         * Gets the "creditGradeCode" element
         */
        public com.scb.sci.customer.fm.CreditGradeCodeDocument.CreditGradeCode getCreditGradeCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.CreditGradeCodeDocument.CreditGradeCode target = null;
                target = (com.scb.sci.customer.fm.CreditGradeCodeDocument.CreditGradeCode)get_store().find_element_user(CREDITGRADECODE$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "creditGradeCode" element
         */
        public void setCreditGradeCode(com.scb.sci.customer.fm.CreditGradeCodeDocument.CreditGradeCode creditGradeCode)
        {
            generatedSetterHelperImpl(creditGradeCode, CREDITGRADECODE$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "creditGradeCode" element
         */
        public com.scb.sci.customer.fm.CreditGradeCodeDocument.CreditGradeCode addNewCreditGradeCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.CreditGradeCodeDocument.CreditGradeCode target = null;
                target = (com.scb.sci.customer.fm.CreditGradeCodeDocument.CreditGradeCode)get_store().add_element_user(CREDITGRADECODE$6);
                return target;
            }
        }
        
        /**
         * Gets the "creditGradeEffectiveDate" element
         */
        public java.lang.String getCreditGradeEffectiveDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREDITGRADEEFFECTIVEDATE$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "creditGradeEffectiveDate" element
         */
        public org.apache.xmlbeans.XmlString xgetCreditGradeEffectiveDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CREDITGRADEEFFECTIVEDATE$8, 0);
                return target;
            }
        }
        
        /**
         * Sets the "creditGradeEffectiveDate" element
         */
        public void setCreditGradeEffectiveDate(java.lang.String creditGradeEffectiveDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREDITGRADEEFFECTIVEDATE$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CREDITGRADEEFFECTIVEDATE$8);
                }
                target.setStringValue(creditGradeEffectiveDate);
            }
        }
        
        /**
         * Sets (as xml) the "creditGradeEffectiveDate" element
         */
        public void xsetCreditGradeEffectiveDate(org.apache.xmlbeans.XmlString creditGradeEffectiveDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CREDITGRADEEFFECTIVEDATE$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CREDITGRADEEFFECTIVEDATE$8);
                }
                target.set(creditGradeEffectiveDate);
            }
        }
        
        /**
         * Gets the "creditGradeReasonForChange" element
         */
        public java.lang.String getCreditGradeReasonForChange()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREDITGRADEREASONFORCHANGE$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "creditGradeReasonForChange" element
         */
        public org.apache.xmlbeans.XmlString xgetCreditGradeReasonForChange()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CREDITGRADEREASONFORCHANGE$10, 0);
                return target;
            }
        }
        
        /**
         * Sets the "creditGradeReasonForChange" element
         */
        public void setCreditGradeReasonForChange(java.lang.String creditGradeReasonForChange)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREDITGRADEREASONFORCHANGE$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CREDITGRADEREASONFORCHANGE$10);
                }
                target.setStringValue(creditGradeReasonForChange);
            }
        }
        
        /**
         * Sets (as xml) the "creditGradeReasonForChange" element
         */
        public void xsetCreditGradeReasonForChange(org.apache.xmlbeans.XmlString creditGradeReasonForChange)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CREDITGRADEREASONFORCHANGE$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CREDITGRADEREASONFORCHANGE$10);
                }
                target.set(creditGradeReasonForChange);
            }
        }
        
        /**
         * Gets the "approverLocation" element
         */
        public com.scb.sci.customer.fm.ApproverLocationDocument.ApproverLocation getApproverLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.ApproverLocationDocument.ApproverLocation target = null;
                target = (com.scb.sci.customer.fm.ApproverLocationDocument.ApproverLocation)get_store().find_element_user(APPROVERLOCATION$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "approverLocation" element
         */
        public void setApproverLocation(com.scb.sci.customer.fm.ApproverLocationDocument.ApproverLocation approverLocation)
        {
            generatedSetterHelperImpl(approverLocation, APPROVERLOCATION$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "approverLocation" element
         */
        public com.scb.sci.customer.fm.ApproverLocationDocument.ApproverLocation addNewApproverLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.ApproverLocationDocument.ApproverLocation target = null;
                target = (com.scb.sci.customer.fm.ApproverLocationDocument.ApproverLocation)get_store().add_element_user(APPROVERLOCATION$12);
                return target;
            }
        }
        
        /**
         * Gets the "coinNo" element
         */
        public java.lang.String getCoinNo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COINNO$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "coinNo" element
         */
        public org.apache.xmlbeans.XmlString xgetCoinNo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COINNO$14, 0);
                return target;
            }
        }
        
        /**
         * Sets the "coinNo" element
         */
        public void setCoinNo(java.lang.String coinNo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COINNO$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COINNO$14);
                }
                target.setStringValue(coinNo);
            }
        }
        
        /**
         * Sets (as xml) the "coinNo" element
         */
        public void xsetCoinNo(org.apache.xmlbeans.XmlString coinNo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COINNO$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COINNO$14);
                }
                target.set(coinNo);
            }
        }
        
        /**
         * Gets the "approverEmpId" element
         */
        public java.lang.String getApproverEmpId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APPROVEREMPID$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "approverEmpId" element
         */
        public org.apache.xmlbeans.XmlString xgetApproverEmpId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APPROVEREMPID$16, 0);
                return target;
            }
        }
        
        /**
         * Sets the "approverEmpId" element
         */
        public void setApproverEmpId(java.lang.String approverEmpId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APPROVEREMPID$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(APPROVEREMPID$16);
                }
                target.setStringValue(approverEmpId);
            }
        }
        
        /**
         * Sets (as xml) the "approverEmpId" element
         */
        public void xsetApproverEmpId(org.apache.xmlbeans.XmlString approverEmpId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APPROVEREMPID$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(APPROVEREMPID$16);
                }
                target.set(approverEmpId);
            }
        }
        
        /**
         * Gets the "approverName" element
         */
        public java.lang.String getApproverName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APPROVERNAME$18, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "approverName" element
         */
        public org.apache.xmlbeans.XmlString xgetApproverName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APPROVERNAME$18, 0);
                return target;
            }
        }
        
        /**
         * Sets the "approverName" element
         */
        public void setApproverName(java.lang.String approverName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APPROVERNAME$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(APPROVERNAME$18);
                }
                target.setStringValue(approverName);
            }
        }
        
        /**
         * Sets (as xml) the "approverName" element
         */
        public void xsetApproverName(org.apache.xmlbeans.XmlString approverName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APPROVERNAME$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(APPROVERNAME$18);
                }
                target.set(approverName);
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
