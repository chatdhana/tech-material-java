/*
 * An XML document type.
 * Localname: leHierarchyInfo
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.LeHierarchyInfoDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one leHierarchyInfo(@) element.
 *
 * This is a complex type.
 */
public class LeHierarchyInfoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.LeHierarchyInfoDocument
{
    private static final long serialVersionUID = 1L;
    
    public LeHierarchyInfoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LEHIERARCHYINFO$0 = 
        new javax.xml.namespace.QName("", "leHierarchyInfo");
    
    
    /**
     * Gets the "leHierarchyInfo" element
     */
    public atlas.pubsub.xmlbeans.le.LeHierarchyInfoDocument.LeHierarchyInfo getLeHierarchyInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            atlas.pubsub.xmlbeans.le.LeHierarchyInfoDocument.LeHierarchyInfo target = null;
            target = (atlas.pubsub.xmlbeans.le.LeHierarchyInfoDocument.LeHierarchyInfo)get_store().find_element_user(LEHIERARCHYINFO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "leHierarchyInfo" element
     */
    public void setLeHierarchyInfo(atlas.pubsub.xmlbeans.le.LeHierarchyInfoDocument.LeHierarchyInfo leHierarchyInfo)
    {
        generatedSetterHelperImpl(leHierarchyInfo, LEHIERARCHYINFO$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "leHierarchyInfo" element
     */
    public atlas.pubsub.xmlbeans.le.LeHierarchyInfoDocument.LeHierarchyInfo addNewLeHierarchyInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            atlas.pubsub.xmlbeans.le.LeHierarchyInfoDocument.LeHierarchyInfo target = null;
            target = (atlas.pubsub.xmlbeans.le.LeHierarchyInfoDocument.LeHierarchyInfo)get_store().add_element_user(LEHIERARCHYINFO$0);
            return target;
        }
    }
    /**
     * An XML leHierarchyInfo(@).
     *
     * This is a complex type.
     */
    public static class LeHierarchyInfoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.LeHierarchyInfoDocument.LeHierarchyInfo
    {
        private static final long serialVersionUID = 1L;
        
        public LeHierarchyInfoImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LEID$0 = 
            new javax.xml.namespace.QName("", "leId");
        private static final javax.xml.namespace.QName PARENTLEID$2 = 
            new javax.xml.namespace.QName("", "parentLeId");
        private static final javax.xml.namespace.QName HIERARCHYTYPE$4 = 
            new javax.xml.namespace.QName("", "hierarchyType");
        private static final javax.xml.namespace.QName HIERARCHYTYPEDESC$6 = 
            new javax.xml.namespace.QName("", "hierarchyTypeDesc");
        
        
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
         * Gets the "parentLeId" element
         */
        public java.lang.String getParentLeId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARENTLEID$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "parentLeId" element
         */
        public org.apache.xmlbeans.XmlString xgetParentLeId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARENTLEID$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "parentLeId" element
         */
        public void setParentLeId(java.lang.String parentLeId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARENTLEID$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARENTLEID$2);
                }
                target.setStringValue(parentLeId);
            }
        }
        
        /**
         * Sets (as xml) the "parentLeId" element
         */
        public void xsetParentLeId(org.apache.xmlbeans.XmlString parentLeId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARENTLEID$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PARENTLEID$2);
                }
                target.set(parentLeId);
            }
        }
        
        /**
         * Gets the "hierarchyType" element
         */
        public java.lang.String getHierarchyType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HIERARCHYTYPE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "hierarchyType" element
         */
        public org.apache.xmlbeans.XmlString xgetHierarchyType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HIERARCHYTYPE$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "hierarchyType" element
         */
        public void setHierarchyType(java.lang.String hierarchyType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HIERARCHYTYPE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HIERARCHYTYPE$4);
                }
                target.setStringValue(hierarchyType);
            }
        }
        
        /**
         * Sets (as xml) the "hierarchyType" element
         */
        public void xsetHierarchyType(org.apache.xmlbeans.XmlString hierarchyType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HIERARCHYTYPE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(HIERARCHYTYPE$4);
                }
                target.set(hierarchyType);
            }
        }
        
        /**
         * Gets the "hierarchyTypeDesc" element
         */
        public java.lang.String getHierarchyTypeDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HIERARCHYTYPEDESC$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "hierarchyTypeDesc" element
         */
        public org.apache.xmlbeans.XmlString xgetHierarchyTypeDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HIERARCHYTYPEDESC$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "hierarchyTypeDesc" element
         */
        public void setHierarchyTypeDesc(java.lang.String hierarchyTypeDesc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HIERARCHYTYPEDESC$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HIERARCHYTYPEDESC$6);
                }
                target.setStringValue(hierarchyTypeDesc);
            }
        }
        
        /**
         * Sets (as xml) the "hierarchyTypeDesc" element
         */
        public void xsetHierarchyTypeDesc(org.apache.xmlbeans.XmlString hierarchyTypeDesc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HIERARCHYTYPEDESC$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(HIERARCHYTYPEDESC$6);
                }
                target.set(hierarchyTypeDesc);
            }
        }
    }
}
