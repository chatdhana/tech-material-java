/*
 * An XML document type.
 * Localname: synRoles
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.SynRolesDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one synRoles(@) element.
 *
 * This is a complex type.
 */
public class SynRolesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.SynRolesDocument
{
    private static final long serialVersionUID = 1L;
    
    public SynRolesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SYNROLES$0 = 
        new javax.xml.namespace.QName("", "synRoles");
    
    
    /**
     * Gets the "synRoles" element
     */
    public com.scb.sci.customer.fm.SynRolesDocument.SynRoles getSynRoles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.scb.sci.customer.fm.SynRolesDocument.SynRoles target = null;
            target = (com.scb.sci.customer.fm.SynRolesDocument.SynRoles)get_store().find_element_user(SYNROLES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "synRoles" element
     */
    public void setSynRoles(com.scb.sci.customer.fm.SynRolesDocument.SynRoles synRoles)
    {
        generatedSetterHelperImpl(synRoles, SYNROLES$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "synRoles" element
     */
    public com.scb.sci.customer.fm.SynRolesDocument.SynRoles addNewSynRoles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.scb.sci.customer.fm.SynRolesDocument.SynRoles target = null;
            target = (com.scb.sci.customer.fm.SynRolesDocument.SynRoles)get_store().add_element_user(SYNROLES$0);
            return target;
        }
    }
    /**
     * An XML synRoles(@).
     *
     * This is a complex type.
     */
    public static class SynRolesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.SynRolesDocument.SynRoles
    {
        private static final long serialVersionUID = 1L;
        
        public SynRolesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SYNROLE$0 = 
            new javax.xml.namespace.QName("", "synRole");
        
        
        /**
         * Gets a List of "synRole" elements
         */
        public java.util.List<com.scb.sci.customer.fm.SynRoleDocument.SynRole> getSynRoleList()
        {
            final class SynRoleList extends java.util.AbstractList<com.scb.sci.customer.fm.SynRoleDocument.SynRole>
            {
                @Override
                public com.scb.sci.customer.fm.SynRoleDocument.SynRole get(int i)
                    { return SynRolesImpl.this.getSynRoleArray(i); }
                
                @Override
                public com.scb.sci.customer.fm.SynRoleDocument.SynRole set(int i, com.scb.sci.customer.fm.SynRoleDocument.SynRole o)
                {
                    com.scb.sci.customer.fm.SynRoleDocument.SynRole old = SynRolesImpl.this.getSynRoleArray(i);
                    SynRolesImpl.this.setSynRoleArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, com.scb.sci.customer.fm.SynRoleDocument.SynRole o)
                    { SynRolesImpl.this.insertNewSynRole(i).set(o); }
                
                @Override
                public com.scb.sci.customer.fm.SynRoleDocument.SynRole remove(int i)
                {
                    com.scb.sci.customer.fm.SynRoleDocument.SynRole old = SynRolesImpl.this.getSynRoleArray(i);
                    SynRolesImpl.this.removeSynRole(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return SynRolesImpl.this.sizeOfSynRoleArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new SynRoleList();
            }
        }
        
        /**
         * Gets array of all "synRole" elements
         * @deprecated
         */
        @Deprecated
        public com.scb.sci.customer.fm.SynRoleDocument.SynRole[] getSynRoleArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<com.scb.sci.customer.fm.SynRoleDocument.SynRole> targetList = new java.util.ArrayList<com.scb.sci.customer.fm.SynRoleDocument.SynRole>();
                get_store().find_all_element_users(SYNROLE$0, targetList);
                com.scb.sci.customer.fm.SynRoleDocument.SynRole[] result = new com.scb.sci.customer.fm.SynRoleDocument.SynRole[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "synRole" element
         */
        public com.scb.sci.customer.fm.SynRoleDocument.SynRole getSynRoleArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.SynRoleDocument.SynRole target = null;
                target = (com.scb.sci.customer.fm.SynRoleDocument.SynRole)get_store().find_element_user(SYNROLE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "synRole" element
         */
        public int sizeOfSynRoleArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SYNROLE$0);
            }
        }
        
        /**
         * Sets array of all "synRole" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setSynRoleArray(com.scb.sci.customer.fm.SynRoleDocument.SynRole[] synRoleArray)
        {
            check_orphaned();
            arraySetterHelper(synRoleArray, SYNROLE$0);
        }
        
        /**
         * Sets ith "synRole" element
         */
        public void setSynRoleArray(int i, com.scb.sci.customer.fm.SynRoleDocument.SynRole synRole)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.SynRoleDocument.SynRole target = null;
                target = (com.scb.sci.customer.fm.SynRoleDocument.SynRole)get_store().find_element_user(SYNROLE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(synRole);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "synRole" element
         */
        public com.scb.sci.customer.fm.SynRoleDocument.SynRole insertNewSynRole(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.SynRoleDocument.SynRole target = null;
                target = (com.scb.sci.customer.fm.SynRoleDocument.SynRole)get_store().insert_element_user(SYNROLE$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "synRole" element
         */
        public com.scb.sci.customer.fm.SynRoleDocument.SynRole addNewSynRole()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.SynRoleDocument.SynRole target = null;
                target = (com.scb.sci.customer.fm.SynRoleDocument.SynRole)get_store().add_element_user(SYNROLE$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "synRole" element
         */
        public void removeSynRole(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SYNROLE$0, i);
            }
        }
    }
}
