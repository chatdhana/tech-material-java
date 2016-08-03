/*
 * An XML document type.
 * Localname: empRelationship
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.EmpRelationshipDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one empRelationship(@) element.
 *
 * This is a complex type.
 */
public class EmpRelationshipDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.EmpRelationshipDocument
{
    private static final long serialVersionUID = 1L;
    
    public EmpRelationshipDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EMPRELATIONSHIP$0 = 
        new javax.xml.namespace.QName("", "empRelationship");
    
    
    /**
     * Gets the "empRelationship" element
     */
    public com.scb.sci.customer.fm.EmpRelationshipDocument.EmpRelationship getEmpRelationship()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.scb.sci.customer.fm.EmpRelationshipDocument.EmpRelationship target = null;
            target = (com.scb.sci.customer.fm.EmpRelationshipDocument.EmpRelationship)get_store().find_element_user(EMPRELATIONSHIP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "empRelationship" element
     */
    public void setEmpRelationship(com.scb.sci.customer.fm.EmpRelationshipDocument.EmpRelationship empRelationship)
    {
        generatedSetterHelperImpl(empRelationship, EMPRELATIONSHIP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "empRelationship" element
     */
    public com.scb.sci.customer.fm.EmpRelationshipDocument.EmpRelationship addNewEmpRelationship()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.scb.sci.customer.fm.EmpRelationshipDocument.EmpRelationship target = null;
            target = (com.scb.sci.customer.fm.EmpRelationshipDocument.EmpRelationship)get_store().add_element_user(EMPRELATIONSHIP$0);
            return target;
        }
    }
    /**
     * An XML empRelationship(@).
     *
     * This is a complex type.
     */
    public static class EmpRelationshipImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.EmpRelationshipDocument.EmpRelationship
    {
        private static final long serialVersionUID = 1L;
        
        public EmpRelationshipImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LEID$0 = 
            new javax.xml.namespace.QName("", "leId");
        private static final javax.xml.namespace.QName SUBPROFILEID$2 = 
            new javax.xml.namespace.QName("", "subProfileId");
        private static final javax.xml.namespace.QName EMPEMPCODEMAPID$4 = 
            new javax.xml.namespace.QName("", "empEmpCodeMapId");
        private static final javax.xml.namespace.QName EMPMAPID$6 = 
            new javax.xml.namespace.QName("", "empMapId");
        private static final javax.xml.namespace.QName EMPID$8 = 
            new javax.xml.namespace.QName("", "empId");
        private static final javax.xml.namespace.QName EMPCODE$10 = 
            new javax.xml.namespace.QName("", "empCode");
        private static final javax.xml.namespace.QName EMPNAME$12 = 
            new javax.xml.namespace.QName("", "empName");
        private static final javax.xml.namespace.QName BKGLOCATION$14 = 
            new javax.xml.namespace.QName("", "bkgLocation");
        private static final javax.xml.namespace.QName EMPRELATIONSHIPTYPE$16 = 
            new javax.xml.namespace.QName("", "empRelationshipType");
        private static final javax.xml.namespace.QName PRINCIPALFAMIND$18 = 
            new javax.xml.namespace.QName("", "principalFAMInd");
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
         * Gets the "empEmpCodeMapId" element
         */
        public java.lang.String getEmpEmpCodeMapId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMPEMPCODEMAPID$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "empEmpCodeMapId" element
         */
        public org.apache.xmlbeans.XmlString xgetEmpEmpCodeMapId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMPEMPCODEMAPID$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "empEmpCodeMapId" element
         */
        public void setEmpEmpCodeMapId(java.lang.String empEmpCodeMapId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMPEMPCODEMAPID$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMPEMPCODEMAPID$4);
                }
                target.setStringValue(empEmpCodeMapId);
            }
        }
        
        /**
         * Sets (as xml) the "empEmpCodeMapId" element
         */
        public void xsetEmpEmpCodeMapId(org.apache.xmlbeans.XmlString empEmpCodeMapId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMPEMPCODEMAPID$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EMPEMPCODEMAPID$4);
                }
                target.set(empEmpCodeMapId);
            }
        }
        
        /**
         * Gets the "empMapId" element
         */
        public java.lang.String getEmpMapId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMPMAPID$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "empMapId" element
         */
        public org.apache.xmlbeans.XmlString xgetEmpMapId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMPMAPID$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "empMapId" element
         */
        public void setEmpMapId(java.lang.String empMapId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMPMAPID$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMPMAPID$6);
                }
                target.setStringValue(empMapId);
            }
        }
        
        /**
         * Sets (as xml) the "empMapId" element
         */
        public void xsetEmpMapId(org.apache.xmlbeans.XmlString empMapId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMPMAPID$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EMPMAPID$6);
                }
                target.set(empMapId);
            }
        }
        
        /**
         * Gets the "empId" element
         */
        public java.lang.String getEmpId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMPID$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "empId" element
         */
        public org.apache.xmlbeans.XmlString xgetEmpId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMPID$8, 0);
                return target;
            }
        }
        
        /**
         * Sets the "empId" element
         */
        public void setEmpId(java.lang.String empId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMPID$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMPID$8);
                }
                target.setStringValue(empId);
            }
        }
        
        /**
         * Sets (as xml) the "empId" element
         */
        public void xsetEmpId(org.apache.xmlbeans.XmlString empId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMPID$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EMPID$8);
                }
                target.set(empId);
            }
        }
        
        /**
         * Gets the "empCode" element
         */
        public java.lang.String getEmpCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMPCODE$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "empCode" element
         */
        public org.apache.xmlbeans.XmlString xgetEmpCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMPCODE$10, 0);
                return target;
            }
        }
        
        /**
         * Sets the "empCode" element
         */
        public void setEmpCode(java.lang.String empCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMPCODE$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMPCODE$10);
                }
                target.setStringValue(empCode);
            }
        }
        
        /**
         * Sets (as xml) the "empCode" element
         */
        public void xsetEmpCode(org.apache.xmlbeans.XmlString empCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMPCODE$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EMPCODE$10);
                }
                target.set(empCode);
            }
        }
        
        /**
         * Gets the "empName" element
         */
        public java.lang.String getEmpName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMPNAME$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "empName" element
         */
        public org.apache.xmlbeans.XmlString xgetEmpName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMPNAME$12, 0);
                return target;
            }
        }
        
        /**
         * Sets the "empName" element
         */
        public void setEmpName(java.lang.String empName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMPNAME$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMPNAME$12);
                }
                target.setStringValue(empName);
            }
        }
        
        /**
         * Sets (as xml) the "empName" element
         */
        public void xsetEmpName(org.apache.xmlbeans.XmlString empName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMPNAME$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EMPNAME$12);
                }
                target.set(empName);
            }
        }
        
        /**
         * Gets the "bkgLocation" element
         */
        public com.scb.sci.customer.fm.BkgLocationDocument.BkgLocation getBkgLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.BkgLocationDocument.BkgLocation target = null;
                target = (com.scb.sci.customer.fm.BkgLocationDocument.BkgLocation)get_store().find_element_user(BKGLOCATION$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "bkgLocation" element
         */
        public void setBkgLocation(com.scb.sci.customer.fm.BkgLocationDocument.BkgLocation bkgLocation)
        {
            generatedSetterHelperImpl(bkgLocation, BKGLOCATION$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "bkgLocation" element
         */
        public com.scb.sci.customer.fm.BkgLocationDocument.BkgLocation addNewBkgLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.BkgLocationDocument.BkgLocation target = null;
                target = (com.scb.sci.customer.fm.BkgLocationDocument.BkgLocation)get_store().add_element_user(BKGLOCATION$14);
                return target;
            }
        }
        
        /**
         * Gets the "empRelationshipType" element
         */
        public com.scb.sci.customer.fm.EmpRelationshipTypeDocument.EmpRelationshipType getEmpRelationshipType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.EmpRelationshipTypeDocument.EmpRelationshipType target = null;
                target = (com.scb.sci.customer.fm.EmpRelationshipTypeDocument.EmpRelationshipType)get_store().find_element_user(EMPRELATIONSHIPTYPE$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "empRelationshipType" element
         */
        public void setEmpRelationshipType(com.scb.sci.customer.fm.EmpRelationshipTypeDocument.EmpRelationshipType empRelationshipType)
        {
            generatedSetterHelperImpl(empRelationshipType, EMPRELATIONSHIPTYPE$16, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "empRelationshipType" element
         */
        public com.scb.sci.customer.fm.EmpRelationshipTypeDocument.EmpRelationshipType addNewEmpRelationshipType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.EmpRelationshipTypeDocument.EmpRelationshipType target = null;
                target = (com.scb.sci.customer.fm.EmpRelationshipTypeDocument.EmpRelationshipType)get_store().add_element_user(EMPRELATIONSHIPTYPE$16);
                return target;
            }
        }
        
        /**
         * Gets the "principalFAMInd" element
         */
        public java.lang.String getPrincipalFAMInd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRINCIPALFAMIND$18, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "principalFAMInd" element
         */
        public org.apache.xmlbeans.XmlString xgetPrincipalFAMInd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRINCIPALFAMIND$18, 0);
                return target;
            }
        }
        
        /**
         * Sets the "principalFAMInd" element
         */
        public void setPrincipalFAMInd(java.lang.String principalFAMInd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRINCIPALFAMIND$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRINCIPALFAMIND$18);
                }
                target.setStringValue(principalFAMInd);
            }
        }
        
        /**
         * Sets (as xml) the "principalFAMInd" element
         */
        public void xsetPrincipalFAMInd(org.apache.xmlbeans.XmlString principalFAMInd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRINCIPALFAMIND$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRINCIPALFAMIND$18);
                }
                target.set(principalFAMInd);
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
